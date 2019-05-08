package refactoring.smell.magic_number;

public class Bar {

    public boolean doSomething(int age, int status) {
        //Question: what does 21 and 1 means?
        if (age > 21 && status == 1) {
            return true;
        } else {
            return false;
        }
    }
}
