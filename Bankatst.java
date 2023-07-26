class Bankatst{

public static void main(String args[])
{

Bank1 bank=new Bank1();

bank.setBankId(123);
System.out.println(bank.getBankId());

bank.setBankName("Bank of baroda");
System.out.println(bank.getBankName());

bank.setBranch("Hassan");
System.out.println(bank.getBranch());

bank.setBranchCOde("Hassan");
System.out.println(bank.getBranchCOde());

bank.setAddress("Hassan123456");
System.out.println(bank.getAddress());

bank.setHelplino(2546879125L);
System.out.println(bank.getHelplino());

bank.setBranchMnager("neha");
System.out.println(bank.getBranchMnager());


bank.setIfscCode("BABAlu0123");
System.out.println(bank.getIfscCode());

bank.setMiscCode(456456);
System.out.println(bank.getMiscCode());

bank.setNoOfLockers(10);
System.out.println(bank.getNoOfLockers());

bank.setNoOfEmployee(35);
System.out.println(bank.getNoOfEmployee());

bank.setTiming(8);
System.out.println(bank.getTiming());

bank.setWebsiteDetails("bobalu@gmail.com");
System.out.println(bank.getWebsiteDetails());


}
}