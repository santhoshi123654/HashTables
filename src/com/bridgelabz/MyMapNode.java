package com.bridgelabz;

public class MyMapNode <K, V> implements INode<K> {

		private K key;
		private V value;
		private INode<K> next;

		public MyMapNode(K key, V value) {
			super();
			this.key = key;
			this.value = value;
			this.next = null;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		@Override
		public K getKey() {

			return this.key;
		}

		@Override
		public void setKey(K key) {
			
			this.key = key;
		}

		@Override
		public void setNext(INode<K> next) {
			
			this.next = next;

		}

		@Override
		public INode<K> getNext() {
			return next;
		}

		@Override
		public String toString() {
			return "MyMapNode [key=" + key + ", value=" + value + "]";
		}
}
