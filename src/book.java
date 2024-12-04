public class book {

    private Integer id;
    private String FirstName;
    private String LastName;
    private String address;
    private String phone;
    private String note;

    public book(String FirstName,String LastName,String address)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.address=address;
    }

    public String GetFirstName(){return FirstName;}
    public String GetLastName(){return LastName;}
    public String GetAddress(){return address;}
    public String GetPhone(){return phone;}
    public Integer GetId(){return id;}
    public String GetNote(){return note;}

    public void SetFirstName(String FirstName){this.FirstName=FirstName;}
    public void SetLastName(String LastName){this.LastName = LastName;}
    public void SetAddress(String address){this.address = address;}
    public void SetPhone(String phone){this.phone = phone;}
    public void SetId(Integer id){this.id = id;}
    public void SetNote(String note){this.note = note;}

    @Override
    public String toString()
    {
        return  "ID: " + id + "\n" +
                "Имя: " + FirstName + "\n" +
                "Фамилия: " + LastName + "\n" +
                "Адрес: " + address + "\n"+
                "Номер телефона: " + phone + "\n" +
                "Заметка: " + note + "\n";
    }


}
