package jp.co.basenet.accopening.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	/**
	 * 
	 * "0 0 * * * *" = the top of every hour of every day. "*\10 * * * * *" = every
	 * ten seconds. "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day. 0 0 8,10 *
	 * * *" = 8 and 10 o'clock of every day. "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00,
	 * 9:30 and 10 o'clock every day. "0 0 9-17 * * MON-FRI" = on the hour
	 * nine-to-five weekdays "0 0 0 25 12 ?" = every Christmas Day at midnight
	 * second, minute, hour, day of month, month, day(s) of week
	 * 
	 */
	@Scheduled(cron = "0 0 18 * * MON-FRI")
	// @Scheduled(cron = "*/5 * * * * *")
	public void reportCurrentTime() {
		logger.info("The time is now {}", dateFormat.format(new Date()));
		logger.error("The time is now {}", dateFormat.format(new Date()));
		System.out.println("The time is now {}" + dateFormat.format(new Date()));
	}

}