package list1challenge;

public class Patient {
	private String name;
	private Integer age;
	private String sex;
	private Double height;
	private Double weight;
	
	public Patient(String name, Integer age, String sex, Double height, Double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
	};
	
    public String getName() {
        return name;
    };

    public Integer getAge() {
        return age;
    };

    public String getSex() {
        return sex;
    };

    public Double getHeight() {
        return height;
    };

    public Double getWeight() {
        return weight;
    };
};
