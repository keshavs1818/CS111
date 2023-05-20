/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author:
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {
        listOfPatients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {
        int number = 0;
        listOfPatients[arrayIndex] = p;
        if ( arrayIndex >= listOfPatients.length ) {
            number = -1;
        }

        return number;
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {
        listOfPatients = new Person[numberOfLines];
        int count = 0;
        for(int i = 0; i < numberOfLines; i++) {
            int id = StdIn.readInt();
            int ethnicity = StdIn.readInt();
            int gender = StdIn.readInt();
            int age = StdIn.readInt();
            int cause = StdIn.readInt();
            int urgency = StdIn.readInt();
            int health = StdIn.readInt();
            Person p = new Person(id, ethnicity, gender, age, cause, urgency, health);
            int number = addPerson(p, i);
            if ( number == 0 ) {
                count++;
            }
            //listOfPatients[i] = p;
            //System.out.println(id + " " + ethnicity + " " + gender + " " + age + " " + cause + " " + urgency + " " + health);
        }

        return count;
    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {
        survivabilityByAge = new SurvivabilityByAge[numberOfLines];
        int count = 0;
        for(int i = 0; i < numberOfLines; i++) {
            int sba_age = StdIn.readInt();
            int sba_years = StdIn.readInt();
            double sba_rate = StdIn.readDouble();
            SurvivabilityByAge sba = new SurvivabilityByAge(sba_age, sba_years, sba_rate);
            survivabilityByAge[i] = sba;
            //System.out.println(sba_age + " " + sba_years + " " + sba_rate);
            count++;
        }
        return count;
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {
        survivabilityByCause = new SurvivabilityByCause[numberOfLines];
        int count = 0;
        for(int i = 0; i < numberOfLines; i++) {
            int sbc_cause = StdIn.readInt();
            int sbc_years = StdIn.readInt();
            double sbc_rate = StdIn.readDouble();
            SurvivabilityByCause sbc = new SurvivabilityByCause(sbc_cause, sbc_years, sbc_rate);
            survivabilityByCause[i] = sbc;
            //System.out.println(sbc_cause + " " + sbc_years + " " + sbc_rate);
            count++;
        }
        return count;
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getAge() > age) {
                count++;
            }
        }

        Person[] getAgeParam = new Person[count];
        int ageCount = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getAge() > age) {
                getAgeParam[ageCount] = listOfPatients[i];
                ageCount++;
            }
        }

        if ( count > 0 ) {
            return getAgeParam;
        } else {
            return null;
        }
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getStateOfHealth() == state) {
                count++;
            }
        }
        Person[] getStateParam = new Person[count];
        int stateCount = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getStateOfHealth() == state) {
                getStateParam[stateCount] = listOfPatients[i];
                stateCount++;
            }
        }
        
        if ( count > 0 ) {
            return getStateParam;
        } else {
            return null;
        }
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getCause() == cause) {
                count++;
            }
        }
        Person[] getCauseParam = new Person[count];
        int causeCount = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getCause() == cause) {
                getCauseParam[causeCount] = listOfPatients[i];
                causeCount++;
            }
        }
 
        if ( count > 0 ) {
            return getCauseParam;
        } else {
            return null;
        }
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {
        if( numberOfHearts >= listOfPatients.length ) {
            return listOfPatients;
        }

        int count = 0;
        for( int i=0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getAge() < 70 && listOfPatients[i].getUrgency() == 8) {
                count++;
            }
        }
        Person[] matchTP = new Person[count];

        int transplantCount = 0;
        for( int i=0; i < listOfPatients.length; i++) {
            if(listOfPatients[i].getAge() < 70 && listOfPatients[i].getUrgency() == 8) {
                matchTP[transplantCount] = listOfPatients[i];
                transplantCount++;
            }
        }

        if ( numberOfHearts < transplantCount ) {
            Person[] matchHearts = new Person[numberOfHearts];
            for(int i=0; i<numberOfHearts; i++) {
                matchHearts[i] = matchTP[i];
            }
            return matchHearts;
        } else {
            return matchTP;
        }
    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }

        /*
        System.out.println( "Before >>>>>>>>>>>>>>>>>>>" + ht.getListOfPatients().length );
        Person[] matchHP = ht.match(100);
        System.out.println( "After 1>>>>>>>>>>>>>>>>>>>" + matchHP.length );
        Person[] matchHP2 = ht.match(10);
        System.out.println( "After 2>>>>>>>>>>>>>>>>>>>" + matchHP2.length );
        for (Person p : matchHP2 ) {
            //StdOut.println(p);
        }
        Person[] matchHP3 = ht.match(ht.getListOfPatients().length);
        System.out.println( "After 3>>>>>>>>>>>>>>>>>>>" + matchHP3.length );
        Person[] matchHP4 = ht.match(3);
        System.out.println( "After 4>>>>>>>>>>>>>>>>>>>" + matchHP4.length );
        */
        //System.out.println(  ht.getPatientsWithAgeAbove( 100 ) );
        
    }
}
