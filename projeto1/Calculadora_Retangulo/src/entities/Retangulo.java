package entities;

public class Retangulo {
   private double width;
   private double height;
   private double area;
   private double perimetro;
   private double diagonal;


    public Retangulo(Double width, Double height){
        this.width = width;
        this.height = height;
        calculaArea();//Isso supre a necessidade do que foi solicitado, porém aplicar os metodos no construtor impede que ele possa modificar o objeto utilizando set
        calculaPerimetro();
        calculaDiagonal();
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void calculaArea(){
        area =width * height;
          
    }
    public void calculaPerimetro(){
        perimetro = (width*2)+(height*2);
    }
    public void calculaDiagonal(){
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " AREA = " + area +
            "\n PERIMETER = " + perimetro +
            "\n DIAGONAL = " + diagonal;
    }
    
}

