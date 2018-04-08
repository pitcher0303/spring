package spring;

public class MemberPrinter {
	public void print(Member member) {
		System.out.printf("회원정보: 아이디 =%s, 이메일=%s, 이름=%s, 등록일=%tF\n", member.getPassword(), member.getEmail(),
				member.getName(), member.getRegisterDate());
	}
	
	public void varargsPrint(String... args) {
		for(String arg : args) {
			System.out.println(arg);
		}
	}
	
}
