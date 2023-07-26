class PassportApplication{

private String name;
private String dob;
private long phNo;
private String destination;
private String birthplace;
private String maritalStatus;
private String employmentStatus;
private String qualification;
private int noOfFamilyMembers;
private String legalGuardians;


public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setDob(String dob){
this.dob=dob;
}
public String getDob(){
return dob;
}
public void setPhNo(long phNo){
this.phNo=phNo;
}
public long getPhNo(){
return phNo;
}
public void setDestination(String destination){
this.destination=destination;
}
public String getDestination(){
return destination;
}
public void setBirthPlace(String birthplace){
this.birthplace=birthplace;
}
public String getBirthPlace(){
return birthplace;
}
public void setMaritalStatus(String maritalStatus){
this.maritalStatus=maritalStatus;
}
public String getMaritalStatus(){
return maritalStatus;
}
public void setEmploymentStatus(String employmentStatus){
this.employmentStatus=employmentStatus;
}
public String getEmploymentStatus(){
return employmentStatus;
}
public void setQualification(String qualification){
this.qualification=qualification;
}
public String getQualification(){
return qualification;
}
public void setFamily(int noOfFamilyMembers){
this.noOfFamilyMembers=noOfFamilyMembers;
}
public int getFamily(){
return noOfFamilyMembers;
}
public void setGuardians(String legalGuardians){
this.legalGuardians=legalGuardians;
}
public String getGuardians(){
return legalGuardians;
}
}
