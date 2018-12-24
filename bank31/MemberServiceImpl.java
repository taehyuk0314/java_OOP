package bank31;

public class MemberServiceImpl implements MemberService{
	
	private MemberBean[] members;
	private int count;
	public MemberServiceImpl() {
		members = new MemberBean[10];	
		count =0;
	}
	@Override
	public void join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setid(id);
		member.setName(name);
		member.setpass(pass);
		member.setssn(ssn);
		members[count] = member;
		count++;
	}

	@Override
	public MemberBean[] list() {
		return members;
	}
	
	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	@Override
	public boolean login(String id, String pass) {
		MemberBean member = new MemberBean();
		boolean ok = false;
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)&&
					members[i].getpass().equals(pass)) {
				ok =true;
				break;
			}
	}
			return ok;
}
	@Override
	public int count() {
		return members.length;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


}
