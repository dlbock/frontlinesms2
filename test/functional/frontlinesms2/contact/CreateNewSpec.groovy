package frontlinesms2.contact

class CreateNewSpec extends grails.plugin.geb.GebSpec {
	def 'button to create new contact exists and goes to "New contact" page'() {
		when:
			to ContactListPage
			def btnCreateContact = $("#create-contact").find('a')
		then:
			assert btnCreateContact.getAttribute('href') == "/frontlinesms2/contact/createContact"
	}

	def 'button to create new group exists and goes to "New group" page'() {
		when:
			to ContactListPage
			def btnCreateGroup = $("#create-group").find('a')
		then:
			assert btnCreateGroup.getAttribute('href') == "/frontlinesms2/contact/createGroup"
	}

}
