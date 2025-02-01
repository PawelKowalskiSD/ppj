package dev.pawel.extra;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class SortedDoublyLinkedListTest {

    @Test
    void shouldAddStudentToEmptyList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        //When
        sortedDoublyLinkedList.add(pawelKowalski);
        //Then
        assertEquals(1, sortedDoublyLinkedList.size());
        assertEquals("Pawel", sortedDoublyLinkedList.get(0).getStudent().name());
        assertEquals("Kowalski", sortedDoublyLinkedList.get(0).getStudent().surname());
        assertEquals(2342, sortedDoublyLinkedList.get(0).getStudent().s());
    }

    @Test
    void shouldAddTwoStudentToListAndSortThem() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        //When
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        //Then
        assertEquals(2, sortedDoublyLinkedList.size());
        assertEquals("Pawel", sortedDoublyLinkedList.get(0).getStudent().name());
        assertEquals("Kowalski", sortedDoublyLinkedList.get(0).getStudent().surname());
        assertEquals(2342, sortedDoublyLinkedList.get(0).getStudent().s());
        assertEquals("Damian", sortedDoublyLinkedList.get(1).getStudent().name());
        assertEquals("Nowak", sortedDoublyLinkedList.get(1).getStudent().surname());
        assertEquals(6142, sortedDoublyLinkedList.get(1).getStudent().s());
    }
    @Test
    void shouldAddSixStudentsAndSortThem_whenOrderIsAToZ() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        //When
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(romanSmith);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(patrykSmith);
        //Then
        assertEquals(6, sortedDoublyLinkedList.size());
        assertEquals("Robert", sortedDoublyLinkedList.get(0).getStudent().name());
        assertEquals("Kowalczyk", sortedDoublyLinkedList.get(0).getStudent().surname());
        assertEquals(6742, sortedDoublyLinkedList.get(0).getStudent().s());
        assertEquals("Pawel", sortedDoublyLinkedList.get(1).getStudent().name());
        assertEquals("Kowalski", sortedDoublyLinkedList.get(1).getStudent().surname());
        assertEquals(2342, sortedDoublyLinkedList.get(1).getStudent().s());
        assertEquals("Rafal", sortedDoublyLinkedList.get(2).getStudent().name());
        assertEquals("Nawrocki", sortedDoublyLinkedList.get(2).getStudent().surname());
        assertEquals(2543, sortedDoublyLinkedList.get(2).getStudent().s());
        assertEquals("Damian", sortedDoublyLinkedList.get(3).getStudent().name());
        assertEquals("Nowak", sortedDoublyLinkedList.get(3).getStudent().surname());
        assertEquals(6142, sortedDoublyLinkedList.get(3).getStudent().s());
        assertEquals("Patryk", sortedDoublyLinkedList.get(4).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(4).getStudent().surname());
        assertEquals(1411, sortedDoublyLinkedList.get(4).getStudent().s());
        assertEquals("Roman", sortedDoublyLinkedList.get(5).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(5).getStudent().surname());
        assertEquals(3312, sortedDoublyLinkedList.get(5).getStudent().s());
    }
    @Test
    void shouldReverseList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(romanSmith);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(patrykSmith);
        //When
        sortedDoublyLinkedList.reverse();
        //Then
        assertEquals(6, sortedDoublyLinkedList.size());
        assertEquals("Roman", sortedDoublyLinkedList.get(0).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(0).getStudent().surname());
        assertEquals(3312, sortedDoublyLinkedList.get(0).getStudent().s());
        assertEquals("Patryk", sortedDoublyLinkedList.get(1).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(1).getStudent().surname());
        assertEquals(1411, sortedDoublyLinkedList.get(1).getStudent().s());
        assertEquals("Damian", sortedDoublyLinkedList.get(2).getStudent().name());
        assertEquals("Nowak", sortedDoublyLinkedList.get(2).getStudent().surname());
        assertEquals(6142, sortedDoublyLinkedList.get(2).getStudent().s());
        assertEquals("Rafal", sortedDoublyLinkedList.get(3).getStudent().name());
        assertEquals("Nawrocki", sortedDoublyLinkedList.get(3).getStudent().surname());
        assertEquals(2543, sortedDoublyLinkedList.get(3).getStudent().s());
        assertEquals("Pawel", sortedDoublyLinkedList.get(4).getStudent().name());
        assertEquals("Kowalski", sortedDoublyLinkedList.get(4).getStudent().surname());
        assertEquals(2342, sortedDoublyLinkedList.get(4).getStudent().s());
        assertEquals("Robert", sortedDoublyLinkedList.get(5).getStudent().name());
        assertEquals("Kowalczyk", sortedDoublyLinkedList.get(5).getStudent().surname());
        assertEquals(6742, sortedDoublyLinkedList.get(5).getStudent().s());
    }
    @Test
    void shouldRemoveLastStudent() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(romanSmith);
        sortedDoublyLinkedList.add(robertKowalczyk);
        //When
        sortedDoublyLinkedList.removeLast();
        //Then
        assertEquals(3, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldRemoveFirstStudent() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(romanSmith);
        sortedDoublyLinkedList.add(robertKowalczyk);
        //When
        sortedDoublyLinkedList.removeFirst();
        //Then
        assertEquals(3, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldRemoveFirstStudent_whenIsOnlyOneObject() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        sortedDoublyLinkedList.add(pawelKowalski);
        //When
        sortedDoublyLinkedList.removeFirst();
        //Then
        assertEquals(0, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldRemoveLastStudent_whenIsOnlyOneStudent() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        sortedDoublyLinkedList.add(pawelKowalski);
        //When
        sortedDoublyLinkedList.removeLast();
        //Then
        assertEquals(0, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldThrowRemovalFromEmptyListException_whenTryRemoveLastStudentFromEmptyList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        //When && then
        assertThrows(RemovalFromEmptyListException.class, sortedDoublyLinkedList::removeLast);
    }

    @Test
    void shouldThrowRemovalFromEmptyListException_whenTryRemoveFirstStudentFromEmptyList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        //When && then
        assertThrows(RemovalFromEmptyListException.class, sortedDoublyLinkedList::removeFirst);
    }

    @Test
    void shouldThrowRemovalFromEmptyListException_whenTryRemoveStudentByIndexFromEmptyList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        //When && then
        assertThrows(RemovalFromEmptyListException.class, () -> {
            sortedDoublyLinkedList.removeAt(0);
        });
    }

    @Test
    void shouldThrowIndexOutOfBoundsException_whenTryRemoveStudentByIndexFromEmptyList() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        sortedDoublyLinkedList.add(pawelKowalski);
        //When && then
        assertThrows(IndexOutOfBoundsException.class, () -> {
            sortedDoublyLinkedList.removeAt(1);
        });
    }

    @Test
    void shouldRemoveStudentByIndex_whenIsOnlyOneStudent() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        sortedDoublyLinkedList.add(pawelKowalski);
        //When
        sortedDoublyLinkedList.removeAt(0);
        //Then
        assertEquals(0, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldRemoveStudentByIndex_whenIsTwoStudents() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianSmith = new Student("Damian", "Smith", 5213);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(damianSmith);
        //When
        sortedDoublyLinkedList.removeAt(1);
        //Then
        assertEquals(1, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldRemoveStudentByIndex_whenIsManyStudents() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(romanSmith);
        sortedDoublyLinkedList.add(robertKowalczyk);
        //When
        sortedDoublyLinkedList.removeAt(2);
        //Then
        assertEquals(3, sortedDoublyLinkedList.size());
    }

    @Test
    void shouldAddTwoStudentsAndThenReverseList_whenIsReversedAddStudent() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.reverse();
        //Then
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(patrykSmith);
        sortedDoublyLinkedList.add(romanSmith);
        //Then
        assertEquals(6, sortedDoublyLinkedList.size());
        assertEquals("Roman", sortedDoublyLinkedList.get(0).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(0).getStudent().surname());
        assertEquals(3312, sortedDoublyLinkedList.get(0).getStudent().s());
        assertEquals("Patryk", sortedDoublyLinkedList.get(1).getStudent().name());
        assertEquals("Smith", sortedDoublyLinkedList.get(1).getStudent().surname());
        assertEquals(1411, sortedDoublyLinkedList.get(1).getStudent().s());
        assertEquals("Damian", sortedDoublyLinkedList.get(2).getStudent().name());
        assertEquals("Nowak", sortedDoublyLinkedList.get(2).getStudent().surname());
        assertEquals(6142, sortedDoublyLinkedList.get(2).getStudent().s());
        assertEquals("Rafal", sortedDoublyLinkedList.get(3).getStudent().name());
        assertEquals("Nawrocki", sortedDoublyLinkedList.get(3).getStudent().surname());
        assertEquals(2543, sortedDoublyLinkedList.get(3).getStudent().s());
        assertEquals("Pawel", sortedDoublyLinkedList.get(4).getStudent().name());
        assertEquals("Kowalski", sortedDoublyLinkedList.get(4).getStudent().surname());
        assertEquals(2342, sortedDoublyLinkedList.get(4).getStudent().s());
        assertEquals("Robert", sortedDoublyLinkedList.get(5).getStudent().name());
        assertEquals("Kowalczyk", sortedDoublyLinkedList.get(5).getStudent().surname());
        assertEquals(6742, sortedDoublyLinkedList.get(5).getStudent().s());
    }
    @Test
    void shouldDisplayMinIndex_WhenUseSupplyTo() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        MinFinder minFinder = new MinFinder();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(patrykSmith);
        sortedDoublyLinkedList.add(romanSmith);
        //When
        sortedDoublyLinkedList.supplyTo(minFinder);
        //Then
        assertEquals(patrykSmith.s(), minFinder.getTrackedStudent().s());
    }

    @Test
    void shouldDisplayMaxIndex_WhenUseSupplyTo() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        MaxFinder maxFinder = new MaxFinder();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(patrykSmith);
        sortedDoublyLinkedList.add(romanSmith);
        //When
        sortedDoublyLinkedList.supplyTo(maxFinder);
        //Then
        assertEquals(robertKowalczyk.s(), maxFinder.getTrackedStudent().s());
    }

    @Test
    void shouldDisplayIndex_WhenUseSupplyTo() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        IndexFinder indexFinder = new IndexFinder(2543);
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(patrykSmith);
        sortedDoublyLinkedList.add(romanSmith);
        //When
        sortedDoublyLinkedList.supplyTo(indexFinder);
        //Then
        assertEquals(rafalNawrocki.s(), indexFinder.getTrackedStudent().s());
    }

    @Test
    void shouldDisplayArrayList_WhenUseSupplyTo() {
        //Given
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        Student pawelKowalski = new Student("Pawel", "Kowalski", 2342);
        Student damianNowak = new Student("Damian", "Nowak", 6142);
        Student romanSmith = new Student("Roman", "Smith", 3312);
        Student robertKowalczyk = new Student("Robert", "Kowalczyk", 6742);
        Student rafalNawrocki = new Student("Rafal", "Nawrocki", 2543);
        Student patrykSmith = new Student("Patryk", "Smith", 1411);
        sortedDoublyLinkedList.add(damianNowak);
        sortedDoublyLinkedList.add(pawelKowalski);
        sortedDoublyLinkedList.add(rafalNawrocki);
        sortedDoublyLinkedList.add(robertKowalczyk);
        sortedDoublyLinkedList.add(patrykSmith);
        sortedDoublyLinkedList.add(romanSmith);
        //When
        sortedDoublyLinkedList.supplyTo(arrayBuilder);
        String result = Arrays.toString(arrayBuilder.getStudents());
        //Then
        assertEquals(sortedDoublyLinkedList.toString(), result);
    }
}