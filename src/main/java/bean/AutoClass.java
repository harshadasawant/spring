package bean;

import org.springframework.stereotype.Component;


public class AutoClass {
    int id;
//    String name;

//    @Required --> this is depricated. in this annoatation i must to call set Name value if not set then throw beaninitializationexception
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
