package frontlinesms2.connection

import frontlinesms2.Fconnection

class NewSmslibConnectionSpec extends ConnectionGebSpec {
	def 'smslib connection type is available from new connections page' () {
		when:
			to ConnectionsTypePage
		then:
			btnNewSmslibConnection.text() == "Phone/Modem"
	}

	def 'can save new smslib connection' () {
		when:
			to ConnectionsTypePage
			btnNewSmslibConnection.click()
		then:
			at NewSmslibConnectionPage
		when:
			frmNewConnection.name = 'test smslib connection'
			frmNewConnection.port = 'COM1'
			frmNewConnection.baud = '9600'
			btnNewConnectionSave.click()
		then:
			at ConnectionListPage
			Fconnection.count() == 1
			selectedConnection.find('h2').text() == 'test smslib connection'
			selectedConnection.find('h3').text() == 'Phone/Modem'
		cleanup:
			deleteTestConnections()
	}
}
