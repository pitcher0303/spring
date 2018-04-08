package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	@Autowired
	private MemberDao _memDao;
	private MemberPrinter _printer;
	
	public void setMemberDao(MemberDao memDao) {
		_memDao = memDao;
	}
	
	@Autowired
	public void setPrinter(MemberPrinter printer) {
		_printer = printer;
	}
	
	public void printMemberInfo(String email) {
		Member member = _memDao.selectByEmail(email);
		if(member == null) {
			System.out.println("데이터 없음");
			return;
		}
		_printer.print(member);
		_printer.varargsPrint("name", "pass");
		System.out.println();
	}
}
