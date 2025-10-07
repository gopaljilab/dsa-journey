package array.sortpeople;

public class People implements Comparable<People> {
    private String name;
    private int height;

    public People(String name, int age) {
        this.name = name;
        this.height = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int compareTo(People o) {
        int heightComparaision =   o.height - this.height;
        if (heightComparaision == 0) {
            return this.name.compareTo(o.name);
        }
        return heightComparaision;
    }
}
