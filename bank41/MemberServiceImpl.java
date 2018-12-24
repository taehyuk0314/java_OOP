package bank41;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members; 
	private int count;
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	@Override
	public MemberBean join(String id, String name, String ssn, String pass) {
		MemberBean bean = new MemberBean();
		bean.setName(name);
		bean.setId(id);
		bean.setSsn(ssn);
		bean.setPass(pass);
		members[count] = bean;
		count++;
		return bean;
	}

	@Override
	public MemberBean[] list() {
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean bean = new MemberBean();
		for(int i =0; i<count;i++) {
			if(members[i].getId().equals(id)) {
				bean = members[i];
				break;
			}
		}
		return bean;
	}

	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		MemberBean bean = new MemberBean();
		for(int i =0; i<count;i++) {
			if(members[i].getId().equals(id)&&
					members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(String id,String pass, String newpass) {
		for(int i =0; i<count;i++) {
			if(members[i].getId().equals(id)&&
					members[i].getPass().equals(pass)) {
					members[i].setPass(newpass);
				break;
			}
		}
	}
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
