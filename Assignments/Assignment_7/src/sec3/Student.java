package sec3;


public class Student implements Comparable<Student>{
    private String firstName, lastName;
    private int id;

    public Student(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if ((Student) obj == this)
            return true;
        if (!(obj instanceof Student))
            return false;

        Student student = (Student) obj;
        return this.firstName.equals(student.firstName) &&
                this.lastName.equals(student.lastName) && this.id == student.id;
    }


    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " (ID=" + this.id + ") : ";
    }

    @Override
    public int compareTo(Student temp) {
        if (this.lastName.compareTo(temp.lastName) == 0){
            if (this.firstName.compareTo(temp.firstName) == 0){
                return this.id-temp.id;
            }
            return this.firstName.compareTo(temp.firstName);
        }
        return this.lastName.compareTo(temp.lastName);

        /*       String localName = this.lastName + this.firstName + this.id;
        String tempName = temp.lastName + temp.firstName + this.id;
        return localName.compareTo(tempName);*/
    }

}
