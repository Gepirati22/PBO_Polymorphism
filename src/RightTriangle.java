public class RightTriangle extends Triangle {
    private Double base;
    private Double height;

    public RightTriangle(String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
        super.side1 = base;
        super.side2 = height;
        super.side3 = this.getHyptenuse();
    }
    
    public double getHyptenuse() {
        return Math.sqrt((base * base) + (height * height));
    }

    public void calculateArea() {
        super.area = (base * height) / 2;
    }

    public void getInfo () {
        System.out.println("RightTriangle" +name+ "info");
        System.out.println("area:" + super.area);
        System.out.println("with base:" + base);
        System.out.println("and height:" + height);
        System.out.println("and hypotenuse:" + this.getHyptenuse());
        System.out.println();
    }

    void print(){
        
    }
}
