package metzler_p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TaskItemTest {
	
	
	@Test
	void creatingTaskItemFailsWithInvalidDueDate() {
		String end = TaskItem.TaskCreation();		
		assertEquals(end, null);
	}
	
	@Test
	void creatingTaskItemFailsWithInvalidTitle() {
		String end = TaskItem.TaskCreation();
		assertEquals(end, null);
	}
	
	@Test
	void creatingTaskItemSucceedsWithValidDueDate() {
		String end = TaskItem.TaskCreation();
		assertNotEquals(end, null);
	}
	
	@Test
	void creatingTaskItemSucceedsWithValidTitle() {
		String end = TaskItem.TaskCreation();
		assertNotEquals(end, null);
	}
	
	@Test
	void settingTaskItemDueDateFailsWithInvalidDate() {
		String end = TaskItem.TaskModify(0);		
		assertEquals(end, null);
	}
	
	@Test
	void settingTaskItemDueDateSucceedsWithValidDate() {
		String end = TaskItem.TaskModify(0);		
		assertNotEquals(end, null);
	}

	@Test
	void settingTaskItemTitleFailsWithInvalidTitle() {
		String end = TaskItem.TaskModify(0);		
		assertEquals(end, null);
	}
	
	@Test
	void settingTaskItemTitleSucceedsWithValidTitle() {
		String end = TaskItem.TaskModify(0);		
		assertNotEquals(end, null);
	}
}
