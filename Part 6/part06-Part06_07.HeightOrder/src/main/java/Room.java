
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    
    
    public Person shortest(){
        
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortH = this.persons.get(0);
        for(Person person : persons){
            if(person.getHeight() < shortH.getHeight()){
                shortH = person;
            }
        }
        
        return shortH;
    }
    
    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = shortest();
        
        this.persons.remove(shortestPerson);
        
        return shortestPerson;
    }
}
