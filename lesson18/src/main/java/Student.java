public class Student {
    private int id;
    private String name;
    private boolean mail;
    private int age;
    private int cityId;

    public Student(int id, String name, boolean mail, int age, int cityId) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.cityId = cityId;
    }

    public Student(String name, boolean mail, int age, int cityId) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail=" + mail +
                ", age=" + age +
                ", cityId=" + cityId +
                '}';
    }
}
