public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro carro = new Carro( 2001, "Gol", "Volkswagem");
        /*
        carro.ano = 2001;
        carro.marca = "Volkswagem";
        carro.modelo = "Gol";
        */
        //carro.setAno(2001);
        //carro.setMarca("Volkswagem");
        //carro.setModelo("Gol");
        /* 
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        */
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
 
    }
}

