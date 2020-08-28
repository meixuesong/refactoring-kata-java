package refactoring.smell.long_parameter_list.exercise1;

import java.util.Date;
import java.util.List;

public class MeetingRoom {
    private List<Meeting> meetings;

    public void addMeeting(Meeting meeting) {
        if (isRoomAvailable(meeting.getBeginDate(), meeting.getEndDate())) {
            meetings.add(meeting);
        } else {
            throw new RuntimeException("会议时间冲突，无法预定此会议室。");
        }
    }

    //TODO: 保持对象完整
    private boolean isRoomAvailable(Date beginDate, Date endDate) {
        for (Meeting meeting : meetings) {
            if (isConflict(meeting, beginDate, endDate)) {
                return false;
            }
        }

        return true;
    }

    private boolean isConflict(Meeting meeting, Date beginDate, Date endDate) {
        if (isBetween(meeting.getBeginDate(), beginDate, endDate) || isBetween(meeting.getEndDate(), beginDate, endDate)) {
            return true;
        } else if (isBetween(beginDate, meeting.getBeginDate(), meeting.getEndDate()) || isBetween(endDate, meeting.getBeginDate(), meeting.getEndDate())) {
            return true;
        }

        return false;
    }

    private boolean isBetween(Date date, Date beginDate, Date endDate) {
        return date.compareTo(beginDate) >= 0 && date.compareTo(endDate) <= 0;
    }
}
