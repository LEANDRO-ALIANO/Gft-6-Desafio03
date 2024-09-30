package heroClass;

import java.util.Objects;

public class Hero {
private String name;
private Integer age;
private String type;

public Hero(String name, Integer age, String type) {
	
	this.name = name;
	this.age = age;
	this.type = type;
}

public String attack() {
	
	String mensage;
	
	   switch (this.type.toLowerCase()) {
       case "mago":
           mensage = "usou magia";
           break;
       case "guerreiro":
           mensage = "usou espada";
           break;
       case "monge":
           mensage = "usou artes marciais";
           break;
       case "ninja":
           mensage = "usou shuriken";
           break;
       default:
           mensage = "o heroi do tipo " + this.type +" não tem ataque disponivel";
           break;
   }
	   
	   return "O " + this.type +":\n" + "atacou usando:" + mensage + ".";
	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public int hashCode() {
	return Objects.hash(age, name, type);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hero other = (Hero) obj;
	return Objects.equals(age, other.age) && Objects.equals(name, other.name) && Objects.equals(type, other.type);
}

@Override
public String toString() {
	return "Hero name=" + name + ", age=" + age + ", type=" + type + "";
}


}
