package com.community.server.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ServerDto {
    private String ip;
    private String title;
    private String icon;
    private String version;
    private String client;
    private String pvp;
    private String size;
    private String start;
    private String wipe;
    private String mark;
    private int port;
    private int online;
    private ArrayList<String> params;
}
