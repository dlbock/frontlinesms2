package frontlinesms2.connection

import frontlinesms2.*
class ConnectionListSpec extends ConnectionGebSpec {
	def 'When there are no connections, this is explained to the user'() {
		when:
			to ConnectionListPage
		then:
			lstConnections.tag() == 'div'
			lstConnections.text() == 'You have no connections configured.'
	}
	
	def 'There is a New Connection button available when there are no connections'() {
		when:
			to ConnectionListPage
		then:
			btnNewConnection != null
			btnNewConnection.text() == "Add new connection"
	}
	
	def 'There is a Not Connected label shown for inactive connection'() {
		when:
			createTestConnection()
			to ConnectionListPage
		then:
			$('div.status').text() == "Not connected"
		cleanup:
			deleteTestConnections()
	}
	
	def 'There is a Connected label shown for working connection'() {
		when:
			createTestConnection()
			to ConnectionListPage
		then:
			$('div.status').text() == "Not connected"
		when:
			$(".buttons a").click()
		then:
			$('div.status').text() == "Connected"
		cleanup:
			deleteTestConnections()
	}
}
