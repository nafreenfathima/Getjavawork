
public class StallCategory {
	private String name;
    private String detail;
    public StallCategory()
    {
        System.out.println("Using Default Constructor");
        System.out.println("Details of the stall category:");
    }
    public StallCategory(String name,String detail)
    {
        System.out.println("Using Parameterised Constructor");
        System.out.println("Details of the stall category:");
        System.out.println("Name:"+name+"\nDetail:"+detail);
       
    }
   
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setDetail(String detail)
    {
        this.detail = detail;
    }
    public String getDetail()
    {
        return this.detail;
    }
}


