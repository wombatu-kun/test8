package wombatukun.tests.test8.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AccountPKey implements Serializable {

	private String meetingId;
	private Long accNum;

	public AccountPKey() {
	}

	public AccountPKey(String meetingId, Long accNum) {
		this.meetingId = meetingId;
		this.accNum = accNum;
	}

	public String getMeetingId() { return meetingId; }

	public void setMeetingId(String meetingId) { this.meetingId = meetingId; }

	public Long getAccNum() { return accNum; }

	public void setAccNum(Long accNum) { this.accNum = accNum; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccountPKey accountPKey = (AccountPKey) o;
		if (!meetingId.equals(accountPKey.meetingId)) return false;
		return accNum.equals(accountPKey.accNum);
	}

	@Override
	public int hashCode() {
		int result = meetingId.hashCode();
		result = 31 * result + accNum.hashCode();
		return result;
	}
}
