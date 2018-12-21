package bank08;

public class MemberServiceImpl implements MemberService{
	public MemberBean join(String name,String id,String pass,String ssn) {
		MemberBean bean = new MemberBean();
		bean.setId(id);
		bean.setName(name);
		bean.setPass(pass);
		bean.setSsn(ssn);
		return bean;
	}
}
