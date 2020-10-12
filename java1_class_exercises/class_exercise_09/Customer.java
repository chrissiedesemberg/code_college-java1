package exercise9;


public class Customer {
    public String name;
    private String ssn;
    private String status;
   
    // Encapsulate this class.  Make ssn read only. - Done
  
    //Add a custom constructor
    public Customer(String name, String ssn, String status) {
    setName(name);
    setSsn(ssn);
    setStatus(status);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getSsn() {
        return ssn;
    }
    
    public void setSsn(String newSsn) {
        ssn = newSsn;
    }
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String newStatus) {
        status = newStatus;
    }
    

}
