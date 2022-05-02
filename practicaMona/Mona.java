package practicaMona;

public class Mona {

    String phrase;
    String name;
    String activity;
    String tool;

    public Mona(String phrase, String name, String activity, String tool){
        this.phrase = phrase;
        this.name = name;
        this.activity = activity;
        this.tool = tool;
    }

    public String getPhrase(){  return phrase;  }
    public String getName(){  return name;  }
    public String getActivity(){  return activity;  }
    public String getTool(){  return tool;  }

    public boolean setPhrase(String phrase){
        if(!phrase.isEmpty()){
            this.phrase = phrase;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setActivity(String activity){
        if(!activity.isEmpty()){
            this.activity = activity;
            return true;
        }else
            return false;
    }

    public boolean setTool(String tool){
        if(!tool.isEmpty()){
            this.tool = tool;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                phrase+
                        "\nNombre: "+name+
                        "\nActividad: "+activity+
                        "\nHerramienta: "+tool+
                        "\n";
    }
}