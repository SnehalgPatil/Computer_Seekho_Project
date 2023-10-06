package com.example.servicesStaffEnquiry;
import java.util.List;

import com.example.entityStaffEnquiry.*;

public interface StaffManager {
	 List<Staff> getStaff();
	 void addStaff(Staff s1);
	 void delete(int id);
}
