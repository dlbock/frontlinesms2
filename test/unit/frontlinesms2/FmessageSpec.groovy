package frontlinesms2

import spock.lang.*
import grails.plugin.spock.*

class FmessageSpec extends UnitSpec {
	def 'check that "read" flag cannot be null'() {
		setup:
			mockForConstraintsTests(Fmessage)
		when:
			Fmessage message = new Fmessage(read: null)
		then:
			message.read != null || !message.validate()
	}
	
	def 'check that messages are unread by default'() {
		when:
			Fmessage message = new Fmessage()
		then:
			message.read == false
	}
//
//	def "message doesn't have to have an activity"() {
//		given:
//			mockDomain(Fmessage)
//		when:
//			new Fmessage().save()
//		then:
//			Fmessage.count() == 1
//	}
//
//	def 'message can have an activity'() {
//		given:
//			mockDomain(Fmessage)
//			mockDomain(Poll)
//			mockDomain(PollResponse)
//			Poll p = new Poll(title:'Test poll').save()
//			PollResponse response = new PollResponse(poll:p, value:'yes').save()
//		when:
//			def m = new Fmessage(activity:response).save()
//		then:
//			Fmessage.count() == 1
//			Fmessage.get(m.id).activity == response
//	}
}

