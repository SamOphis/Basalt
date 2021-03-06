/*
Copyright 2018 Sam Pritchard

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package basalt.server

/**
 * An enum of responses that are returned in Dispatched `ERROR` Responses, as they're written here.
 *
 * This means that, for example, if you tried to set the volume of a player to -5, an `ERROR` event would be
 * dispatched (as in wrapped in a Dispatch Response and sent back) in response with the value being
 * "VOLUME_OUT_OF_BOUNDS".
 *
 * @author Sam Pritchard
 * @since 1.1.0
 */

enum class ErrorResponses {
    /** Returned if no track was playing upon an attempt to update it (i.e seeking). */
    NO_TRACK,
    /** Returned if the currently playing track isn't seekable upon attempting to seek. */
    TRACK_NOT_SEEKABLE,
    /** Returned if an attempt was made to seek to a position below 0 or longer than the duration of the track. */
    POSITION_OUT_OF_BOUNDS,
    /** Returned if an attempt was made to set the volume to below 0 or above 1000. */
    VOLUME_OUT_OF_BOUNDS,
    /** Returned if an attempt was made to update a non-existent player (before initializing). */
    PLAYER_NOT_INITIALIZED,
    /** Returned if an attempt was made to initialize an already-initialized player. */
    PLAYER_ALREADY_INITIALIZED,
    /** Returned if an attempt was made to pause a player if it is already paused. */
    PLAYER_ALREADY_PAUSED,
    /** Returned if an attempt was made to resume a player if it has already been resumed. */
    PLAYER_ALREADY_RESUMED,
    /** Returned if, for some reason, the internal [SocketContext][basalt.player.SocketContext] associated with the WebSocket Connection is `null`. */
    SOCKET_CONTEXT_NULL
}