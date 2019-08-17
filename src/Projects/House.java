package Projects;

public class House implements Comparable<House> {

    int area;
    int price;
    String city;

    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House {");
        sb.append("area = ").append(area);
        sb.append(", price = ").append(price).append('\'');
        sb.append(", city = ").append(city);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.area == anotherHouse.area) {
            return 0;
        } else if (this.area < anotherHouse.area) {
            return -1;
        } else {
            return 1;
        }
    }
}
