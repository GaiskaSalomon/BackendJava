package practicaMultiverse;

public class Spider {

    private String name;
    private String gender;
    private String story;

    public Spider(String name, String gender, String story){
        this.name = name;
        this.gender = gender;
        this.story = story;
    }

    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getStory(){  return story;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setStory(String story){
        if(!story.isEmpty()){
            this.story = story;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+name+
                        "\nGénero: "+gender+
                        "\nHistoria: "+story+
                        "\n";
    }
}
