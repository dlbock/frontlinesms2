grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits("global") {
		// uncomment to disable ehcache
		// excludes 'ehcache'
	}
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		// uncomment the below to enable remote dependency resolution
		// from public Maven repositories
		mavenLocal()
		mavenCentral()
		//mavenRepo "http://snapshots.repository.codehaus.org"
		//mavenRepo "http://repository.codehaus.org"
		//mavenRepo "http://download.java.net/maven/2/"
		//mavenRepo "http://repository.jboss.com/maven2/"
		mavenRepo "http://dev.frontlinesms.com/m2repo/"
	}
	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

		// TEST
		test 'org.apache.camel:camel-test:2.5.0'
		test 'org.mockito:mockito-all:1.8.5'
		test 'org.seleniumhq.selenium:selenium-firefox-driver:2.0b3'

		// COMPILE
		compile 'net.frontlinesms.core:camel-smslib:0.0.2-SNAPSHOT'
		compile 'org.apache.camel:camel-mail:2.5.0'

		// SHOULD BE AVAILABLE ONLY IN DEV SCOPE
		compile 'net.frontlinesms.test:hayescommandset-test:0.0.2-SNAPSHOT'
	}
}
