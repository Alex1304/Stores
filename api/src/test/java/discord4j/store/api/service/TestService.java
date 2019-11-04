/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.store.api.service;

import com.austinv11.servicer.WireService;
import discord4j.store.api.Store;
import discord4j.store.api.primitive.LongObjStore;
import discord4j.store.api.util.StoreContext;
import reactor.core.publisher.Mono;

@WireService(StoreService.class)
public class TestService implements StoreService {

    @Override
    public boolean hasGenericStores() {
        return true;
    }

    @Override
    public <K extends Comparable<K>, V> Store<K, V> provideGenericStore(Class<K> keyClass,
                                                                        Class<V> valueClass) {
        return new MapStore<>();
    }

    @Override
    public boolean hasLongObjStores() {
        return false;
    }

    @Override
    public <V> LongObjStore<V> provideLongObjStore(Class<V> valueClass) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void init(StoreContext context) {
    }

    @Override
    public Mono<Void> dispose() {
        return Mono.empty();
    }
}
