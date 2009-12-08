/**
 *
 */
package com.google.code.linkedinapi.client;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import com.google.code.linkedinapi.client.enumeration.NetworkUpdateType;
import com.google.code.linkedinapi.client.enumeration.ProfileField;
import com.google.code.linkedinapi.client.enumeration.ProfileType;
import com.google.code.linkedinapi.client.enumeration.SearchParameter;
import com.google.code.linkedinapi.client.enumeration.SearchSortOrder;
import com.google.code.linkedinapi.schema.Authorization;
import com.google.code.linkedinapi.schema.Connections;
import com.google.code.linkedinapi.schema.Network;
import com.google.code.linkedinapi.schema.People;
import com.google.code.linkedinapi.schema.Person;

/**
 * The Interface AsyncLinkedInApiClient. This interface can be used for asynchronous invocation of API methods.
 * 
 * @author Nabeel Mukhtar
 */
public interface AsyncLinkedInApiClient extends LinkedInAuthenticationClient {

    // Profile API. Return Profile bean

    /**
     * Gets the profile for current user.
     * 
     * @return the profile for current user
     */
    public Future<Person> getProfileForCurrentUser();

    /**
     * Gets the profile by id.
     * 
     * @param id the id
     * @param profileType the profile type
     * 
     * @return the profile by id
     */
    public Future<Person> getProfileById(String id, ProfileType profileType);

    /**
     * Gets the profile by url.
     * 
     * @param url the url
     * @param profileType the profile type
     * 
     * @return the profile by url
     */
    public Future<Person> getProfileByUrl(String url, ProfileType profileType);

    /**
     * Gets the profile for current user.
     * 
     * @param profileFields the profile fields
     * 
     * @return the profile for current user
     */
    public Future<Person> getProfileForCurrentUser(Set<ProfileField> profileFields);

    /**
     * Gets the profile by id.
     * 
     * @param id the id
     * @param profileType the profile type
     * @param profileFields the profile fields
     * 
     * @return the profile by id
     */
    public Future<Person> getProfileById(String id, ProfileType profileType, Set<ProfileField> profileFields);

    /**
     * Gets the profile by url.
     * 
     * @param url the url
     * @param profileType the profile type
     * @param profileFields the profile fields
     * 
     * @return the profile by url
     */
    public Future<Person> getProfileByUrl(String url, ProfileType profileType, Set<ProfileField> profileFields);

    // Network Updates API. Return Network Update bean

    /**
     * Gets the network updates.
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates();

    /**
     * Gets the network updates.
     * 
     * @param start the start
     * @param count the count
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(int start, int count);

    /**
     * Gets the network updates.
     * 
     * @param startDate the start date
     * @param endDate the end date
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(Date startDate, Date endDate);

    /**
     * Gets the network updates.
     * 
     * @param updateTypes the update types
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(Set<NetworkUpdateType> updateTypes);

    /**
     * Gets the network updates.
     * 
     * @param updateTypes the update types
     * @param start the start
     * @param count the count
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(Set<NetworkUpdateType> updateTypes, int start, int count);

    /**
     * Gets the network updates.
     * 
     * @param updateTypes the update types
     * @param startDate the start date
     * @param endDate the end date
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(Set<NetworkUpdateType> updateTypes, Date startDate, Date endDate);

    /**
     * Gets the network updates.
     * 
     * @param updateTypes the update types
     * @param count the count
     * @param start the start
     * @param startDate the start date
     * @param endDate the end date
     * 
     * @return the network updates
     */
    public Future<Network> getNetworkUpdates(Set<NetworkUpdateType> updateTypes, int count, int start, Date startDate,
                                     Date endDate);

    // Connections API

    /**
     * Gets the connections for current user.
     * 
     * @return the connections for current user
     */
    public Future<Connections> getConnectionsForCurrentUser();

    /**
     * Gets the connections by id.
     * 
     * @param id the id
     * 
     * @return the connections by id
     */
    public Future<Connections> getConnectionsById(String id);

    /**
     * Gets the connections by email.
     * 
     * @param email the email
     * 
     * @return the connections by email
     */
    public Future<Connections> getConnectionsByEmail(String email);

    /**
     * Gets the connections by url.
     * 
     * @param url the url
     * 
     * @return the connections by url
     */
    public Future<Connections> getConnectionsByUrl(String url);

    /**
     * Gets the connections for current user.
     * 
     * @param profileFields the profile fields
     * 
     * @return the connections for current user
     */
    public Future<Connections> getConnectionsForCurrentUser(Set<ProfileField> profileFields);

    /**
     * Gets the connections by id.
     * 
     * @param id the id
     * @param profileFields the profile fields
     * 
     * @return the connections by id
     */
    public Future<Connections> getConnectionsById(String id, Set<ProfileField> profileFields);

    /**
     * Gets the connections by email.
     * 
     * @param email the email
     * @param profileFields the profile fields
     * 
     * @return the connections by email
     */
    public Future<Connections> getConnectionsByEmail(String email, Set<ProfileField> profileFields);

    /**
     * Gets the connections by url.
     * 
     * @param url the url
     * @param profileFields the profile fields
     * 
     * @return the connections by url
     */
    public Future<Connections> getConnectionsByUrl(String url, Set<ProfileField> profileFields);

    // Connections API with Paging

    /**
     * Gets the connections for current user.
     * 
     * @param start the start
     * @param count the count
     * 
     * @return the connections for current user
     */
    public Future<Connections> getConnectionsForCurrentUser(int start, int count);

    /**
     * Gets the connections by id.
     * 
     * @param id the id
     * @param start the start
     * @param count the count
     * 
     * @return the connections by id
     */
    public Future<Connections> getConnectionsById(String id, int start, int count);

    /**
     * Gets the connections by email.
     * 
     * @param email the email
     * @param start the start
     * @param count the count
     * 
     * @return the connections by email
     */
    public Future<Connections> getConnectionsByEmail(String email, int start, int count);

    /**
     * Gets the connections by url.
     * 
     * @param url the url
     * @param start the start
     * @param count the count
     * 
     * @return the connections by url
     */
    public Future<Connections> getConnectionsByUrl(String url, int start, int count);

    /**
     * Gets the connections for current user.
     * 
     * @param profileFields the profile fields
     * @param start the start
     * @param count the count
     * 
     * @return the connections for current user
     */
    public Future<Connections> getConnectionsForCurrentUser(Set<ProfileField> profileFields, int start, int count);

    /**
     * Gets the connections by id.
     * 
     * @param id the id
     * @param profileFields the profile fields
     * @param start the start
     * @param count the count
     * 
     * @return the connections by id
     */
    public Future<Connections> getConnectionsById(String id, Set<ProfileField> profileFields, int start, int count);

    /**
     * Gets the connections by email.
     * 
     * @param email the email
     * @param profileFields the profile fields
     * @param start the start
     * @param count the count
     * 
     * @return the connections by email
     */
    public Future<Connections> getConnectionsByEmail(String email, Set<ProfileField> profileFields, int start, int count);

    /**
     * Gets the connections by url.
     * 
     * @param url the url
     * @param profileFields the profile fields
     * @param start the start
     * @param count the count
     * 
     * @return the connections by url
     */
    public Future<Connections> getConnectionsByUrl(String url, Set<ProfileField> profileFields, int start, int count);

    // Search API

    /**
     * Search people.
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople();

    /**
     * Search people.
     * 
     * @param searchParameters the search parameters
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(Map<SearchParameter, String> searchParameters);

    /**
     * Search people.
     * 
     * @param start the start
     * @param count the count
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(int start, int count);

    /**
     * Search people.
     * 
     * @param searchParameters the search parameters
     * @param start the start
     * @param count the count
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(Map<SearchParameter, String> searchParameters, int start, int count);

    /**
     * Search people.
     * 
     * @param sortOrder the sort order
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(SearchSortOrder sortOrder);

    /**
     * Search people.
     * 
     * @param searchParameters the search parameters
     * @param sortOrder the sort order
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(Map<SearchParameter, String> searchParameters, SearchSortOrder sortOrder);

    /**
     * Search people.
     * 
     * @param start the start
     * @param count the count
     * @param sortOrder the sort order
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(int start, int count, SearchSortOrder sortOrder);

    /**
     * Search people.
     * 
     * @param searchParameters the search parameters
     * @param start the start
     * @param count the count
     * @param sortOrder the sort order
     * 
     * @return the future< people>
     */
    public Future<People> searchPeople(Map<SearchParameter, String> searchParameters, int start, int count,
                               SearchSortOrder sortOrder);

    // Post Network Update API

    /**
     * Post network update.
     * 
     * @param updateText the update text
     * 
     * @return the future<?>
     */
    public Future<?> postNetworkUpdate(String updateText);

    // Post Comment API

    /**
     * Post comment.
     * 
     * @param networkUpdateId the network update id
     * @param commentText the comment text
     * 
     * @return the future<?>
     */
    public Future<?> postComment(String networkUpdateId, String commentText);

    // Status Update API

    /**
     * Update current status.
     * 
     * @param status the status
     * 
     * @return the future<?>
     */
    public Future<?> updateCurrentStatus(String status);

    /**
     * Delete current status.
     * 
     * @return the future<?>
     */
    public Future<?> deleteCurrentStatus();

    // Messaging API

    /**
     * Send message.
     * 
     * @param recepientIds the recepient ids
     * @param subject the subject
     * @param message the message
     * 
     * @return the future<?>
     */
    public Future<?> sendMessage(List<String> recepientIds, String subject, String message);

    // Invitation API

    /**
     * Send invite.
     * 
     * @param recepientId the recepient id
     * @param subject the subject
     * @param message the message
     * 
     * @return the future<?>
     */
    public Future<?> sendInvite(String recepientId, String subject, String message);

    /**
     * Send invite.
     * 
     * @param recepientId the recepient id
     * @param subject the subject
     * @param message the message
     * @param auth the auth
     * 
     * @return the future<?>
     */
    public Future<?> sendInvite(String recepientId, String subject, String message, Authorization auth);

}