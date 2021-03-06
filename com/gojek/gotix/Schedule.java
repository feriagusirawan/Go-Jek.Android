package com.gojek.gotix;

import de.greenrobot.dao.DaoException;
import java.util.List;

public class Schedule
{
  private transient DaoSession daoSession;
  private String date;
  private long event_id;
  private String finish_time;
  private Long finish_time_at;
  private Long id;
  private Integer location_id;
  private transient ScheduleDao myDao;
  private Integer schedule_id;
  private String start_time;
  private Long start_time_at;
  private List<Ticket> tickets;
  
  public Schedule() {}
  
  public Schedule(Long paramLong)
  {
    this.id = paramLong;
  }
  
  public Schedule(Long paramLong1, Integer paramInteger1, String paramString1, String paramString2, String paramString3, Long paramLong2, Long paramLong3, Integer paramInteger2, long paramLong)
  {
    this.id = paramLong1;
    this.schedule_id = paramInteger1;
    this.date = paramString1;
    this.start_time = paramString2;
    this.finish_time = paramString3;
    this.start_time_at = paramLong2;
    this.finish_time_at = paramLong3;
    this.location_id = paramInteger2;
    this.event_id = paramLong;
  }
  
  public void __setDaoSession(DaoSession paramDaoSession)
  {
    this.daoSession = paramDaoSession;
    if (paramDaoSession != null) {}
    for (paramDaoSession = paramDaoSession.getScheduleDao();; paramDaoSession = null)
    {
      this.myDao = paramDaoSession;
      return;
    }
  }
  
  public void delete()
  {
    if (this.myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    this.myDao.delete(this);
  }
  
  public String getDate()
  {
    return this.date;
  }
  
  public long getEvent_id()
  {
    return this.event_id;
  }
  
  public String getFinish_time()
  {
    return this.finish_time;
  }
  
  public Long getFinish_time_at()
  {
    return this.finish_time_at;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public Integer getLocation_id()
  {
    return this.location_id;
  }
  
  public Integer getSchedule_id()
  {
    return this.schedule_id;
  }
  
  public String getStart_time()
  {
    return this.start_time;
  }
  
  public Long getStart_time_at()
  {
    return this.start_time_at;
  }
  
  public List<Ticket> getTickets()
  {
    List localList;
    if (this.tickets == null)
    {
      if (this.daoSession == null) {
        throw new DaoException("Entity is detached from DAO context");
      }
      localList = this.daoSession.getTicketDao()._querySchedule_Tickets(this.id.longValue());
    }
    try
    {
      if (this.tickets == null) {
        this.tickets = localList;
      }
      return this.tickets;
    }
    finally {}
  }
  
  public void refresh()
  {
    if (this.myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    this.myDao.refresh(this);
  }
  
  public void resetTickets()
  {
    try
    {
      this.tickets = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setDate(String paramString)
  {
    this.date = paramString;
  }
  
  public void setEvent_id(long paramLong)
  {
    this.event_id = paramLong;
  }
  
  public void setFinish_time(String paramString)
  {
    this.finish_time = paramString;
  }
  
  public void setFinish_time_at(Long paramLong)
  {
    this.finish_time_at = paramLong;
  }
  
  public void setId(Long paramLong)
  {
    this.id = paramLong;
  }
  
  public void setLocation_id(Integer paramInteger)
  {
    this.location_id = paramInteger;
  }
  
  public void setSchedule_id(Integer paramInteger)
  {
    this.schedule_id = paramInteger;
  }
  
  public void setStart_time(String paramString)
  {
    this.start_time = paramString;
  }
  
  public void setStart_time_at(Long paramLong)
  {
    this.start_time_at = paramLong;
  }
  
  public void update()
  {
    if (this.myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    this.myDao.update(this);
  }
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/gojek/gotix/Schedule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */