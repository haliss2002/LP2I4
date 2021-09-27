// Vinicius RIbeiro CB3010643
// Halisson Oliveira CB3012051
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if(gender == 'f' || gender == 'm'){
        this.gender = gender;
        }
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getName() {return name;}

    public char getGender() {return gender;}

    public String toString(){return ("[Nome= "+ name + ", Email= " + email +", Gender= " + gender + "]");}
}

 class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price=price;
        this.qty=qty;
    }
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price=price;
    }

    public String getName() {return name;}

    public Author[] getAuthor() {return authors;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public int getQty() {return qty;}

    public void setQty(int qty) {this.qty = qty;}

    public String toString(){
        String texto = "";
        texto = "Book[Nome= "+ name+",authors={";
        int i=0;
        while(i!=authors.length){
        texto = texto+"Author[Nome= "+ authors[i].getName() + " Email= " + authors[i].getEmail() +", Gender= " + authors[i].getGender()+"],";
        i++;
        }        
         texto=texto+ "],.....},price="+price+",qty="+qty+"]";
        return texto;
    }
}

class Person{
    protected String name;
    protected String address;

    public Person( String name, String address){
        this.name = name;
        this.address= address;        
    }
    public String getName() {return name;}
    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String toString(){
        return "Person[name="+name+",address="+address+"]";
    }
}

class Student extends Person{
    protected String program;
    protected int year;
    protected double fee;

    public Student( String name, String address,String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year= year;        
        this.fee=fee;
    }
    public String getProgram() {return program;}
    public void setProgram(String program) {this.program=program;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public double getFee() {return fee;}
    public void setFee(double fee) {this.fee = fee;}

    public String toString(){
        return "Student[Person[name="+name+",address="+address+"],program="+program+",year="+year+",fee="+fee+"]";
    }
}

class Staff extends Person{
    protected String school;
    protected double pay;

    public Staff( String name, String address,String school, double pay){
        super(name, address);
        this.school = school;
        this.pay= pay; 
    }

    public String getSchool() {return school;}
    public void setSchool(String school) {this.school=school;}

    public double getPay() {return pay;}
    public void setPay(double pay) {this.pay = pay;}

    public String toString(){
        return "Staff[Person[name="+name+",address="+address+"],school="+school+",pay="+pay+"]";
    }
}


public class LP2I4_TP_01 {
    public static void main(String[] args) {
        System.out.println("--------------TESTE EXE1--------------");
        Author autor = new Author("Halisson", "Halisson@gmail.com", 'm' );
        System.out.println(autor.toString());
        autor.setEmail("Vinicius@gmail.com");
        System.out.println(autor.getEmail());
        System.out.println(autor.getName());
        System.out.println(autor.getGender());
        System.out.println(autor.toString());
        System.out.println("--------------TESTE EXE2--------------");
        // Crie e aloque o array de autores.
        Author[] autors = new Author[2];
        autors[0] = new Author("Halisson2", "Halisson@gmail.com", 'm' );
        autors[1] = new Author("Halisson3", "Halisson@gmail.com", 'm' );
        // Declarar e alocar a instância de um booking.
        Book testeBook = new Book("teste", autors, 19.99, 2);        
        System.out.println(testeBook.getName());
        System.out.println(testeBook.getPrice());
        System.out.println(testeBook.getAuthor());
        System.out.println(testeBook.getQty());
        testeBook.setPrice(20.00);
        testeBook.setQty(4);
        System.out.println(testeBook.toString()); // toString()
        System.out.println("--------------TESTE EXE3--------------");
        Person persona = new Person("Teteu", "Rua Abc 123");
        System.out.println(persona.toString());
        persona.setAddress("Rua Def 456");
        System.out.println(persona.getAddress());
        System.out.println(persona.getName());
        Student aluno = new Student("Jorginho", "Rua Ghi 789", "Soccer", 2002, 21.00);
        System.out.println(aluno.toString());
        aluno.setAddress("Rua Jkl 101");
        aluno.setProgram("Voleibol");
        aluno.setYear(2003);
        aluno.setFee(22);
        System.out.println(aluno.getName());
        System.out.println(aluno.getAddress());
        System.out.println(aluno.getProgram());
        System.out.println(aluno.getYear());
        System.out.println(aluno.getFee());
        Staff ixcola = new Staff("Etec","Rua Mno 112", "da Pg", 30);
        System.out.println(ixcola.toString());
        ixcola.setAddress("Rua Pqr 131");
        ixcola.setSchool("De Sv");
        ixcola.setPay(31);
        System.out.println(ixcola.getName());
        System.out.println(ixcola.getAddress());
        System.out.println(ixcola.getSchool());
        System.out.println(ixcola.getPay());



    }
}
