

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

    }
}


class Person {
    public String fullName;
    public String address;
    public String ID;
    public String phoneNumber;

    public Person(String fullName, String address, String ID, String phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.ID = ID;
        this.phoneNumber = phoneNumber;


    }


    //Getters

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }


    public String getID() {
        return ID;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    //Setters

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

class Student extends Person {
    ArrayList<Lesson> signedLessons;
    ArrayList<Lesson> attendedLessons;

    public Student(String fullName, String address, String ID, String phoneNumber) {
        super(fullName, address, ID, phoneNumber);
        signedLessons = new ArrayList<>();
        attendedLessons = new ArrayList<>();
    }


    void bookLesson(Lesson bookedLesson) {
        for (Lesson lesson : signedLessons) {
            if (lesson.ID.equals(bookedLesson.ID)) {
                return;
            }
        }
        Lesson bookedLessons = new Lesson("");
        this.signedLessons.add(bookedLessons);


    }
}
class Appointment {

    public String ID;
    public String Coach;
    public String Parent;
}


class Coach extends Person {
    ArrayList<Appointment> signAppointment;
    ArrayList<Appointment> declineAppointment;

    public Coach(String fullName, String address, String ID, String phoneNumber) {
        super(fullName, address, ID, phoneNumber);
        signAppointment = new ArrayList<>();
        declineAppointment = new ArrayList<>();

    }


    void bookAppointment(Appointment bookedAppointment) {
        for (Appointment appointment : signAppointment) {
            if (appointment.ID.equals(bookedAppointment.ID)) {
                return;
            }
        }
        Appointment bookedAppointments = new Appointment();
        this.signAppointment.add(bookedAppointment);


    }
}

class Lesson {
    public String ID;
    public String discipline;



    public Lesson(String discipline) {
        this.discipline = discipline;
        this.ID = ID;


    }


    Person JDW = new Student("Jose D Watson", "597 N. Gregory Street Merrimack, NH 03054", "19889458", "007-589 5423");
    Person TMS = new Student("Travis M Swank", "9106 La Sierra Avenue Fernandina Beach, FL 32034", "19567823", "007-587 6589");
    Person SSL = new Student("Sandra S Lawton", "7527 School Ave. Edison, NJ 08817", "19587365", "007-589 4758");
    Person MFA = new Student("Monica F Anderson", "44 Peachtree Street Wheaton, IL 60187", "19853625", "007-598 2493");
    Person NDJ = new Student("Nick D Jonas", "62 Buttonwood Ave. Unit C Reading, MA 01867", "19852963", "007-325 5877");
    Person JFF = new Student("Jim F Francis", "1 E. Fairfield Circle La Verne, TN 37086", "19587259", "007-123 6578");
    Person HDM = new Student("Hank D Monet", "8201 Joy Ridge Dr. Roselle, IL 60172", "19528469", "007-365 8521");
    Person JEV = new Student("Julia E Vance", "42 Windfall Ave. Front Royal, VA 22630", "19854237", "007-257 1346");
    Person AFS = new Student("Anne F Silver", "7128 Oakland Ave. Hobart, IN 46342", "19473185", "007-878 4157");
    Person SCG = new Student("Simone C Geller", "99 Center St. Miamisburg, OH 45342", "19874562", "007-236 6549");
    Person MSH = new Student("Marin S Hammond", "1 Bohemia Rd. Clarksburg, WV 26301", "19587259", "007-123 6578");
    Person RTG = new Student("Rick T Grover", "9193 Lyme Dr. Old Bridge, NJ 08857", "19528469", "007-365 8521");
    Person GIF = new Student("Gabriel I Flores", "961 Hickory Drive Woodbridge, VA 22191", "19854237", "007-257 1346");
    Person CED = new Student("Clara E Dimitri", "856 Walnutwood Street Lake Villa, IL 60046", "19473185", "007-878 4157");
    Person LDC = new Student("Lara D Cortana", "9157 Bear Hill Street Haines City, FL 33844", "19874562", "007-236 6549");

    Person TS = new Coach("Tim Sawyer", "7342 Sherwood Ave. Winter Springs, FL 32708", "19246285", "007-245 8475");
    Person LM = new Coach("Lucas Mayor", "8089 Trenton Dr. Mason City, IA 50401", "19445236", "007-456 6541");
    Person AS = new Coach("Anna Summer", "840 Albany Dr. New Bern, NC 28560", "19992344", "007-111 2365");
    Person LT = new Coach("Liz Taylor", "772 West Bradford Dr. New Baltimore, MI 48047", "19225487", "007-454 8899");
    Person AL = new Coach("Adam Lever", "396 Cypress Ave. Southington, CT 06489", "19451424", "007-131 1332");

    Lesson TB = new Lesson("Test Session Badminton");
    Lesson BB = new Lesson("Beginner Badminton");
    Lesson IB = new Lesson("Intermediate Badminton");
    Lesson AB = new Lesson("Advanced Badminton");
    Lesson CB = new Lesson("Competitive Badminton");

    Lesson TSG = new Lesson( "Test Session Gymnastics");
    Lesson BG = new Lesson( "Beginner Gymnastics");
    Lesson IG = new Lesson("Intermediate Gymnastics");
    Lesson AG = new Lesson("Advanced Gymnastics");
    Lesson CG = new Lesson("Competitive Gymnastics");

    Lesson TSS = new Lesson("Test Session Swimming");
    Lesson BS = new Lesson("Beginner Swimming");
    Lesson IS = new Lesson("Intermediate Swimming");
    Lesson ASG = new Lesson("Advanced Swimming");
    Lesson CSG = new Lesson("Competitive Swimming");

    Lesson TSB = new Lesson("Test Session Basketball");
    Lesson BBL = new Lesson("Beginner Basketball");
    Lesson IBL = new Lesson("Intermediate Basketball");
    Lesson ABL = new Lesson("Advanced Basketball");
    Lesson CBL = new Lesson("Competitive Basketball");


}












