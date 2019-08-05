package day4;

public class TestRef {

    public TestRef() {
    }

    public TestRef(TestRef testRef) {
        a = testRef.a;
    }

    public int a = 4;
}
