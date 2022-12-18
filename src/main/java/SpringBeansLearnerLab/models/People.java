package SpringBeansLearnerLab.models;

import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T> {
    List<T> personList;

    public People(List<T> personList) {
        this.personList = personList;
    }
    public void add(T person){this.personList.add(person);}
    public void remove(T person){this.personList.remove(person);}
    public int size(){return this.personList.size();}
    public void clear(){this.personList.clear();}
    public void addAll(Iterable<T> persons){
        for(T person:persons) this.personList.add(person);
    }
    public T findById(Long id){
        for(T person:this.personList)
            if(person.getId()==id) return person;
        return null;
    }
    public List<T> findAll(){return  this.personList;}
    @Override
    public Iterator<T> iterator() {
        return personList.stream().iterator();
    }
}
