package com.example.urenapp.Model;

public interface MeetingLeader {
abstract void startMeeting();
static void bookConferenceRoom() {
	System.out.println("conference room booked - the free biscuits are divine");
}
}
