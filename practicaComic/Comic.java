package practicaComic;

public class Comic {

    private String collection;
    private String name;
    private double number;
    private String age;
    private String phrase;

    public Comic(String collection, String name, double number, String age, String phrase){
        this.collection = collection;
        this.name = name;
        this.number = number;
        this.age = age;
        this.phrase = phrase;
    }

    public String getCollection(){  return collection;}
    public String getName(){  return name;}
    public double getNumber(){  return number;}
    public String getAge(){  return age;}
    public String getPhrase(){  return phrase;}

    public boolean setCollection(String collection){
        if (!collection.isEmpty()) {
            this.collection = collection;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setNumber(double number){
        if(number>0){
            this.number = number;
            return true;
        }else
            return false;
    }

    public boolean setAge(String age){
        if (!age.isEmpty()) {
            this.age = age;
            return true;
        }else
            return false;
    }
    public boolean setPhrase(String phrase){
        if (!phrase.isEmpty()) {
            this.phrase = phrase;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Collection: "+collection+
                "  Name: "+name+"  Number: "+number+
                "  Age Restriction: "+age+"  Phrase: "+phrase;
    }
}
