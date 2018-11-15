package contact.manager.service.util;

import com.liferay.portal.kernel.scheduler.SchedulerEntry;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;

public class StorageTypeAwareSchedulerEntryImpl 
extends SchedulerEntryImpl 
implements SchedulerEntry, StorageTypeAware {
	private static final long serialVersionUID = 1L;
	
	private SchedulerEntryImpl _schedulerEntry;
	private StorageType _storageType;

	public StorageTypeAwareSchedulerEntryImpl(final SchedulerEntryImpl schedulerEntry) {
		super();

		// use the same default that Liferay uses.
		_storageType = StorageType.MEMORY_CLUSTERED;

		_schedulerEntry = schedulerEntry;
	}

	public StorageTypeAwareSchedulerEntryImpl(final SchedulerEntryImpl schedulerEntry, final StorageType storageType) {
		super();

		_storageType = storageType;
		_schedulerEntry = schedulerEntry;
	}

	@Override
	public String getDescription() {
		return _schedulerEntry.getDescription();
	}
	public void setDescription(final String description) {
		_schedulerEntry.setDescription(description);
	}

	@Override
	public String getEventListenerClass() {
		return _schedulerEntry.getEventListenerClass();
	}
	public void setEventListenerClass(final String eventListenerClass) {
		_schedulerEntry.setEventListenerClass(eventListenerClass);
	}

	@Override
	public StorageType getStorageType() {
		return _storageType;
	}

	@Override
	public Trigger getTrigger() {
		return _schedulerEntry.getTrigger();
	}
	public void setTrigger(final Trigger trigger) {
		_schedulerEntry.setTrigger(trigger);
	}
}
