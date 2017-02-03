package pl.hornunge.creational.prototype.person.brain;

import java.util.StringJoiner;

public class Brain implements Cloneable {
    private int iq;

    public Brain(int iq) {
        this.iq = iq;
    }

    public Brain clone() throws CloneNotSupportedException {
        return (Brain) super.clone(); //Shallow copy is OK in this case as we have only primitive fields.
                                      //How interesting is this! We get Brain object from a method of Object!
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", classNameWithIdHashCode() + "[", "]")
                .add("iq = " + iq)
                .toString()
                ;
    }

    protected String classNameWithIdHashCode(){
        return String.format("%s@%s", getClass().getSimpleName(), idHashCodeAsHex());
    }

    private String idHashCodeAsHex(){
        return Integer.toHexString(System.identityHashCode(this));
    }
}
