package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationGroupMemberStatsWithBLOBs;

public interface ReplicationGroupMemberStatsMapper {
    int insert(ReplicationGroupMemberStatsWithBLOBs record);

    int insertSelective(ReplicationGroupMemberStatsWithBLOBs record);
}