package contact.constantcontact.util;

import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import java.util.Date;

import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;

public class MessageListenerUtil {

	static SchedulerEntryImpl provisionSchedulerEntryImpl(TriggerFactory triggerFactory, String eventListenerClassName, String cronExpression) {
		
		// Create a new trigger definition for the job
		Trigger jobTrigger = triggerFactory.createTrigger(eventListenerClassName, eventListenerClassName, new Date(), null, cronExpression);

		SchedulerEntryImpl schedulerEntryImpl = new SchedulerEntryImpl();
		schedulerEntryImpl.setEventListenerClass( eventListenerClassName );
		schedulerEntryImpl.setTrigger( jobTrigger );
		
		// Wrap the current scheduler entry in a new storage type aware entry
		schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(schedulerEntryImpl, StorageType.PERSISTED);
		schedulerEntryImpl.setTrigger( jobTrigger );

		return schedulerEntryImpl;
	}
	
	/**
	 * getStorageType: Utility method to get the storage type from the scheduler entry wrapper.
	 * @return StorageType The storage type to use.
	 */
	static StorageType getStorageType(SchedulerEntryImpl schedulerEntryImpl) {
		if (schedulerEntryImpl instanceof StorageTypeAware) {
			return ((StorageTypeAware) schedulerEntryImpl).getStorageType();
		}

		return StorageType.MEMORY_CLUSTERED;
	}
}
