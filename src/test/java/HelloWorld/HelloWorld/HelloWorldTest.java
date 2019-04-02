package HelloWorld

class HelloWorldTest extends spock.lang.Specification {
    def subject = new HelloWorld()

    def "add calculate sum of 2 integers"() {
        expect: subject.add(1, 2) == 3
    }
}
