package practice11;

public class Student extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass.getLeader()!=null&&this.getId()==this.klass.getLeader().getId()) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
