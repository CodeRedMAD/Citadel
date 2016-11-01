package com.anthony_powell.citadel;

/**
 * Created by SGT_POWELL on 10/31/2016.
 */

public class User {
 private String email, username;
 private Integer profilePicture;
 private Boolean hasOrders;
 public User(){

 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public Integer getProfilePicture() {
  return profilePicture;
 }

 public void setProfilePicture(Integer profilePicture) {
  this.profilePicture = profilePicture;
 }

 public Boolean getHasOrders() {
  return hasOrders;
 }

 public void setHasOrders(Boolean hasOrders) {
  this.hasOrders = hasOrders;
 }
}
